package com.github.mikephelan.codinginterviewuniversity.tree;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for binary search tree.
 */
public class BinarySearchTreeTest
{
    /**
     * Test membership in tree.
     */
    @Test
    public void binarySearchTreeAddedElementMembership()
    {
	BinaryTree bt = new BinaryTree();
	bt.add(6);
	bt.add(4);
	bt.add(8);
	bt.add(3);
	bt.add(5);
	bt.add(7);
	bt.add(9);

	assertTrue(bt.containsNode(6));
	assertTrue(bt.containsNode(4));
	assertTrue(bt.containsNode(8));
	assertTrue(bt.containsNode(3));
	assertTrue(bt.containsNode(5));
	assertTrue(bt.containsNode(7));
	assertTrue(bt.containsNode(9));
	assertFalse(bt.containsNode(1));
    }
}
