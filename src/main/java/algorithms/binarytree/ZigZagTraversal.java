package algorithms.binarytree;

import algorithms.util.TreeNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class ZigZagTraversal {

  ArrayDeque<TreeNode> queue = new ArrayDeque<>();

  public List<List<Integer>> traverse(TreeNode root) {
    var output = new ArrayList<List<Integer>>();
    int direction = 0;

    queue.add(root);

    while (!queue.isEmpty()) {
      var level = new ArrayList<TreeNode>();
      var outputLevel = new ArrayList<Integer>();

      while (!queue.isEmpty()) {
        var node = queue.poll();
        if (node != null) {
          level.add(node);
        }
      }
      if (!level.isEmpty()) {
        for (var node : level) {
          outputLevel.add(node.val);
          addToQueue(node.left, direction);
          addToQueue(node.right, direction);
        }
        output.add(outputLevel);
      }
      direction++;
    }
    return output;
  }

  private void addToQueue(TreeNode node, int direction) {
    if (node == null) {
      return;
    }
    if (direction % 2 == 1) {
      queue.add(node);
    } else {
      queue.push(node);
    }
  }
}
