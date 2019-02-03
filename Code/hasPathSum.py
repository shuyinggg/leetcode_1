# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def hasPathSum(self, root, sum):
        """
        :type root: TreeNode
        :type sum: int
        :rtype: bool
        """
        return self.hasPathSumHelper(root,sum,0)

    def hasPathSumHelper(self,node, sum, currSum):
        if not node: #null node
            return False
        
        currSum += node.val
        
        if node.left == None and node.right == None:
            return currSum == sum
        
        leftSum = self.hasPathSumHelper(node.left,sum,currSum)
        rightSum = self.hasPathSumHelper(node.right,sum,currSum)
        return  leftSum or rightSum
