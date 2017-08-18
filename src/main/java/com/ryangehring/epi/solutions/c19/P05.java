package com.ryangehring.epi.solutions.c19;

/**
 * String production -
 * Decide if a string s produces t
 * making one character changes from a set. (all words same length).
 *
 * Naive approach - simple BFS.
 * Try every character change. stop when you hit.
 *
 * Danger of naive approach - when to terminate.
 * Thought : are there at most n changes for a string of length n?
 * Not necessarily - suppose i have the words cat - bat - bit - kit
 * here i had to change the letter c to b to get the middle vowel.
 *
 * 
 *
 */
public class P05 {
}
