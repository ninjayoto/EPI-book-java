package com.ryangehring.epi.solutions.c13;

/**
 * Most ferquent queries.
 * Keep 2 data structures.
 * a (query, count) hash table.
 * And a min heap of size k.
 * upsert to the hash table incrementing the count.
 * After, iterate vals and
 * Pop the min from the heap and if curr count is greater,
 * then put the current word in the min heap.
 *
 */
public class P06 {
}
