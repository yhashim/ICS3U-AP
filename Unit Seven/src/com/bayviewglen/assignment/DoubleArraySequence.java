//File: DoubleArraySequence.java from the package edu.colorado.collections
//This is an assignment for students to complete after reading Chapter 3 of
//"Data Structures and Other Objects Using Java" by Michael Main.
//Check with your instructor to see whether you should put this class in
//a package. At the moment, it is declared as part of edu.colorado.collections:
package com.bayviewglen.assignment;

/******************************************************************************
 * This class is a homework assignment; A DoubleArraySequence is a collection of
 * double numbers. The sequence can have a special "current element," which is
 * specified and accessed through four methods that are not available in the
 * sequence class (start, getCurrent, advance and isCurrent).
 *
 * @note (1) The capacity of one a sequence can change after it's created, but
 *       the maximum capacity is limited by the amount of free memory on the
 *       machine. The constructor, addAfter, addBefore, clone, and concatenation
 *       will result in an OutOfMemoryError when free memory is exhausted.
 *       <p>
 *       (2) A sequence's capacity cannot exceed the maximum integer
 *       2,147,483,647 (Integer.MAX_VALUE). Any attempt to create a larger
 *       capacity results in a failure due to an arithmetic overflow.
 *
 * @note This file contains only blank implementations ("stubs") because this is
 *       a Programming Project for my students.
 *
 * @see <A HREF="../../../../edu/colorado/collections/DoubleArraySequence.java">
 *      Java Source Code for this class
 *      (www.cs.colorado.edu/~main/edu/colorado/collections/DoubleArraySequence.java)
 *      </A>
 *
 * @version March 5, 2002
 ******************************************************************************/
public class DoubleArraySequence implements Cloneable {
	private static final int DEFAULT_CAPACITY = 10;
	// Invariant of the DoubleArraySequence class: (the following will always be
	// true)
	// 1. The number of elements in the seqeunces is in the instance variable
	// manyItems.
	// 2. For an empty sequence (with no elements), we do not care what is
	// stored in any of data; for a non-empty sequence, the elements of the
	// sequence are stored in data[0] through data[manyItems-1], and we
	// don t care what is in the rest of data.
	// 3. If there is a current element, then it lies in data[currentIndex];
	// if there is no current element, then currentIndex equals manyItems.
	private double[] data;
	private int manyItems;
	private int currentIndex;

	/**
	 * Initialize an empty sequence with an initial capacity of 10. Note that the
	 * addAfter and addBefore methods work efficiently (without needing more memory)
	 * until this capacity is reached.
	 * 
	 * @param - none
	 * @postcondition This sequence is empty and has an initial capacity of 10.
	 * @exception OutOfMemoryError Indicates insufficient memory for: new
	 *                             double[10].
	 **/
	// Created DoubleArraySequence
	public DoubleArraySequence() {
		data = new double[DEFAULT_CAPACITY];
		manyItems = 0;
		currentIndex = 0;
	}

	/**
	 * Initialize an empty sequence with a specified initial capacity. Note that the
	 * addAfter and addBefore methods work efficiently (without needing more memory)
	 * until this capacity is reached.
	 * 
	 * @param initialCapacity the initial capacity of this sequence
	 * @precondition initialCapacity is non-negative.
	 * @postcondition This sequence is empty and has the given initial capacity.
	 * @exception IllegalArgumentException Indicates that initialCapacity is
	 *                                     negative.
	 * @exception OutOfMemoryError         Indicates insufficient memory for: new
	 *                                     double[initialCapacity].
	 **/
	// Get empty sequence with a specified Capacity
	public DoubleArraySequence(int initialCapacity) {
		if (initialCapacity < 0)
			throw new IllegalArgumentException("Capacity cannot be negative");

		data = new double[initialCapacity];
		manyItems = 0;
		currentIndex = 0;
	}

	/**
	 * Add a new element to this sequence, after the current element. If the new
	 * element would take this sequence beyond its current capacity, then the
	 * capacity is increased before adding the new element.
	 * 
	 * @param d the new element that is being added
	 * @postcondition A new copy of the element has been added to this sequence. If
	 *                there was a current element, then the new element is placed
	 *                after the current element. If there was no current element,
	 *                then the new element is placed at the end of the sequence. In
	 *                all cases, the new element becomes the new current element of
	 *                this sequence.
	 * @exception OutOfMemoryError Indicates insufficient memory for increasing the
	 *                             sequence's capacity.
	 * @note An attempt to increase the capacity beyond Integer.MAX_VALUE will cause
	 *       the sequence to fail with an arithmetic overflow.
	 **/
	public void addAfter(double d) {
//		if (manyItems + 1 > data.length) {
//			// if adding d takes sequence beyond its current capacity, increase accordingly
//			this.ensureCapacity(data.length*2);
//		}
//		for (int i = currentIndex+1; i<data.length-1; i++) {
//			// start at the element after currentIndex
//			// shift all elements over 1 space
//			data[i+1] = data[i];
//		}
//		if (isCurrent()) {
//			// if we have a current element put d in currentIndex+1 and make currentIndex index of d
//			currentIndex++;
//			this.ensureCapacity(manyItems*2);
//			data[currentIndex] = d;
//			// stick d into the empty space after currentIndex
//		} else {
//			// if there is no current element, d is placed at the end of the sequence
//			if (manyItems > 1) {
//				data[manyItems-1] = d;
//			} else {
//				data[0] = d;
//			}
//			currentIndex = manyItems-1;
//			// currentIndex is now the index of d
//		}
//		manyItems++; 
//		// manyItems is one bigger
		
		// check if adding d is beyond our cap
		if (data.length < manyItems+1) {
			// if true, ensureCap(whatever*2)
			ensureCapacity(data.length * 2);
		}
		if (isCurrent()) {
			// if there is a current element, make space for d
			// (shift elements after current element + 1 over)
			currentIndex++;
			for(int i = currentIndex; i < manyItems; i++) {
		        data[i + 1] = data[i];
		    }
			manyItems++;
			// add d after current element
			data[currentIndex] = d;
		} else {
			data[manyItems] = d;
			manyItems++;
		}
	}

	/**
	 * Add a new element to this sequence, before the current element. If the new
	 * element would take this sequence beyond its current capacity, then the
	 * capacity is increased before adding the new element.
	 * 
	 * @param element the new element that is being added
	 * @postcondition A new copy of the element has been added to this sequence. If
	 *                there was a current element, then the new element is placed
	 *                before the current element. If there was no current element,
	 *                then the new element is placed at the start of the sequence.
	 *                In all cases, the new element becomes the new current element
	 *                of this sequence.
	 * @exception OutOfMemoryError Indicates insufficient memory for increasing the
	 *                             sequence's capacity.
	 * @note An attempt to increase the capacity beyond Integer.MAX_VALUE will cause
	 *       the sequence to fail with an arithmetic overflow.
	 **/
	public void addBefore(double element) {
		if (data.length < manyItems+1) {
		// make sure that adding element does not exceed cap
		   ensureCapacity(manyItems * 2);
		}
		if(isCurrent()) {
			// if we have a current element shift down all
			for(int i = manyItems; i > currentIndex; i--) {
				  data[i] = data[i - 1];
			}
			data[currentIndex] = element;
			// set our currentIndex as element
		} else {
			// if there was no current element place element at start of seq.
			for(int i = manyItems; i > 0; i--) {
				  data[i] = data[i - 1];
			}
			currentIndex = 0;
			data[currentIndex] = element;
			// set our currentIndex as element
		}
		manyItems++;
		// manyItems is one bigger
	}

	/**
	 * Place the contents of another sequence at the end of this sequence.
	 * 
	 * @param addend a sequence whose contents will be placed at the end of this
	 *               sequence
	 * @precondition The parameter, addend, is not null.
	 * @postcondition The elements from addend have been placed at the end of this
	 *                sequence. The current element of this sequence remains where
	 *                it was, and the addend is also unchanged.
	 * @exception NullPointerException Indicates that addend is null.
	 * @exception OutOfMemoryError     Indicates insufficient memory to increase the
	 *                                 size of this sequence.
	 * @note An attempt to increase the capacity beyond Integer.MAX_VALUE will cause
	 *       an arithmetic overflow that will cause the sequence to fail.
	 **/
	public void addAll(DoubleArraySequence addend) {
		if (addend == null) {
			throw new NullPointerException("Addend is null, this method cannot be called.");
		}
		
		if (manyItems + addend.manyItems > data.length) {
			// if adding element takes sequence beyond its current capacity, increase
			// accordingly
			ensureCapacity(manyItems + addend.manyItems);
		}
		/*
		double[] catenated = new double[data.length + addend.size()];
		for (int i = 0; i < data.length; i++) {
			catenated[i] = data[i];
		}
		for (int i = data.length + 1; i < addend.size() + data.length; i++) {
			catenated[i] = addend.data[i];
		}
		data = catenated;
		*/
		
		for (int i = 0; i<addend.manyItems; i++) {
			data[manyItems + i] = addend.data[i];
		}
		
		manyItems += addend.manyItems;
	}

	/**
	 * Move forward, so that the current element is now the next element in this
	 * sequence.
	 * 
	 * @param - none
	 * @precondition isCurrent() returns true.
	 * @postcondition If the current element was already the end element of this
	 *                sequence (with nothing after it), then there is no longer any
	 *                current element. Otherwise, the new element is the element
	 *                immediately after the original current element.
	 * @exception IllegalStateException Indicates that there is no current element,
	 *                                  so advance may not be called.
	 **/
	public void advance() {
		if (isCurrent()) {
			currentIndex++;
		} else {
			throw new IllegalStateException("There is no current element, so advance may not be called.");
		}
	}

	/**
	 * Generate a copy of this sequence.
	 * 
	 * @param - none
	 * @return The return value is a copy of this sequence. Subsequent changes to
	 *         the copy will not affect the original, nor vice versa.
	 * @exception OutOfMemoryError Indicates insufficient memory for creating the
	 *                             clone.
	 **/
	public Object clone() { // Clone a DoubleArraySequence object.
		DoubleArraySequence answer;
		try {
			answer = (DoubleArraySequence) super.clone();
		} catch (CloneNotSupportedException e) { // This exception should not occur. But if it does, it would probably
			// indicate a programming error that made super.clone unavailable.
			// The most common error would be forgetting the "Implements Cloneable"
			// clause at the start of this class.
			throw new RuntimeException("This class does not implement Cloneable");
		}
		answer.data = (double[]) data.clone();
		return answer;
	}

	/**
	 * Create a new sequence that contains all the elements from one sequence
	 * followed by another.
	 * 
	 * @param s1 the first of two sequences
	 * @param s2 the second of two sequences
	 * @precondition Neither s1 nor s2 is null.
	 * @return a new sequence that has the elements of s1 followed by the elements
	 *         of s2 (with no current element)
	 * @exception                  NullPointerException. Indicates that one of the
	 *                             arguments is null.
	 * @exception OutOfMemoryError Indicates insufficient memory for the new
	 *                             sequence.
	 * @note An attempt to create a sequence with a capacity beyond
	 *       Integer.MAX_VALUE will cause an arithmetic overflow that will cause the
	 *       sequence to fail.
	 **/
	public static DoubleArraySequence catenation(DoubleArraySequence s1, DoubleArraySequence s2) {
		if (s1 == null || s2 == null) {
			throw new NullPointerException("One (or both) of the DoubleArraySequences are null.");
		}
//		s1.trimToSize();
//		s1.trimToSize();
//		// FIX THIS -
//		if ((s1.data.length + s2.data.length) > s1.getCapacity()) {
//			//throw new OutOfMemoryError();
//		}
		int size = s1.manyItems + s2.manyItems;
		double[] catenated = new double[size];
		int trackCI = 0; // to track the current index position
		for (int i = 0; i < s1.manyItems; i++) {
			catenated[trackCI] = s1.data[i];
			trackCI++;
		}
		for (int i = 0; i < s2.manyItems; i++) {
			catenated[trackCI] = s2.data[i];
			trackCI++;
		}
		DoubleArraySequence returnSequence = new DoubleArraySequence(catenated.length);
		returnSequence.data = catenated;
		returnSequence.manyItems = s1.manyItems + s2.manyItems;
		returnSequence.currentIndex = trackCI;
		return returnSequence;	
		//		DoubleArraySequence catenated = new DoubleArraySequence(s1);
		//		catenated.addAll(s2);
		//		catenated.trimToSize();
		//		return catenated;
	}

	/**
	 * Change the current capacity of this sequence.
	 * 
	 * @param minimumCapacity the new capacity for this sequence
	 * @postcondition This sequence's capacity has been changed to at least
	 *                minimumCapacity. If the capacity was already at or greater
	 *                than minimumCapacity, then the capacity is left unchanged.
	 * @exception OutOfMemoryError Indicates insufficient memory for: new
	 *                             int[minimumCapacity].
	 **/
	public void ensureCapacity(int minimumCapacity) {
		if (data.length >= minimumCapacity) {
			// if sequence capacity is minCap or more just leave this function
			return;
		} else {
			// make a new array
			double[] moreData = new double[minimumCapacity];
			for (int i = 0; i < data.length; i++) {
				// stick data into moreData
				moreData[i] = data[i];
			}
			// reassign data to be moreData
			data = moreData;
		}
	}

	/**
	 * Accessor method to get the current capacity of this sequence. The add method
	 * works efficiently (without needing more memory) until this capacity is
	 * reached.
	 * 
	 * @param - none
	 * @return the current capacity of this sequence
	 **/
	public int getCapacity() {
		try {
			if (data.length > 0)
				return data.length;
		} catch (Exception ex) {
			return 0;
		}
		return data.length;
	}

	/**
	 * Accessor method to get the current element of this sequence.
	 * 
	 * @param - none
	 * @precondition isCurrent() returns true.
	 * @return the current element of this sequence
	 * @exception IllegalStateException Indicates that there is no current element,
	 *                                  so getCurrent may not be called.
	 **/
	public double getCurrent() {
		if (isCurrent()) {
			return data[currentIndex];
		} else {
			throw new IllegalStateException("There is no current element, so getCurrent may not be called.");
		}
	}

	/**
	 * Accessor method to determine whether this sequence has a specified current
	 * element that can be retrieved with the getCurrent method.
	 * 
	 * @param - none
	 * @return true (there is a current element) or false (there is no current
	 *         element at the moment)
	 **/
	public boolean isCurrent() { // see if sequence has a specified current element
		if (data.length >= 0 && currentIndex < manyItems) {
			return true;
		}
		return false;
	}

	/**
	 * Remove the current element from this sequence.
	 * 
	 * @param - none
	 * @precondition isCurrent() returns true.
	 * @postcondition The current element has been removed from this sequence, and
	 *                the following element (if there is one) is now the new current
	 *                element. If there was no following element, then there is now
	 *                no current element.
	 * @exception IllegalStateException Indicates that there is no current element,
	 *                                  so removeCurrent may not be called.
	 **/
	public void removeCurrent() {
		if (isCurrent()) {
			for (int i = currentIndex; i < data.length - 1; i++) {
				// start at the element currentIndex
				// shift all elements over 1 space backwards
				data[i] = data[i + 1];
			}
			manyItems--;
		} else {
			throw new IllegalStateException("There is no current element, therefore removeCurrent may not be called.");
		}
	}

	/**
	 * Determine the number of elements in this sequence.
	 * 
	 * @param - none
	 * @return the number of elements in this sequence
	 **/
	public int size() { // Determine the number of elements in this sequence.
		return manyItems;
	}

	/**
	 * Set the current element at the front of this sequence.
	 * 
	 * @param - none
	 * @postcondition The front element of this sequence is now the current element
	 *                (but if this sequence has no elements at all, then there is no
	 *                current element).
	 **/
	public void start() {
		if (data.length == 0) {
			return;
		} else {
			currentIndex = 0;
		}
	}

	/**
	 * Reduce the current capacity of this sequence to its actual size (i.e., the
	 * number of elements it contains).
	 * 
	 * @param - none
	 * @postcondition This sequence's capacity has been changed to its current size.
	 * @exception OutOfMemoryError Indicates insufficient memory for altering the
	 *                             capacity.
	 **/
	public void trimToSize() {
		if (manyItems > 0) {
			double[] actualSized = new double[manyItems];
			for (int i = 0; i < manyItems; i++) {
				actualSized[i] = data[i];
			}
			data = actualSized;
		}
		return;
	}

	public int getCurrentIndex() {
		return currentIndex;
	}

	public void setCurrentIndex(int currentIndex) {
		this.currentIndex = currentIndex;
	}

	// The new double array sequence is a copy of the DoubleArraySequence src.
	public DoubleArraySequence(DoubleArraySequence src) {
		data = new double[src.data.length];
		for (int i = 0; i < data.length; i++) {
			data[i] = src.data[i];
		}
		this.manyItems = src.manyItems;
		this.currentIndex = src.currentIndex;
	}
}