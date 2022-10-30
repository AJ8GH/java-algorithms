package algorithms.binarytree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import algorithms.util.TreeNode;
import java.util.List;
import org.junit.jupiter.api.Test;

class ZigZagTraversalTest {

  @Test
  void traverse() {
    var input = new TreeNode(3);
    input.left = new TreeNode(9);
    input.right = new TreeNode(20, new TreeNode(7), new TreeNode(15));

    var zigZagTraversal = new ZigZagTraversal();
    var actual = zigZagTraversal.traverse(input);
    var expected = List.of(List.of(3), List.of(20, 9), List.of(7, 15));

    assertEquals(expected, actual);
  }
}
