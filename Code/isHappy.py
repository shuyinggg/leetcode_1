class Solution:
    global count 
    def isHappy(self, n):
        """
        :type n: int
        :rtype: bool
        """
        count = 0
        while (n > 0):
            count += 1
            summ = 0
            nStr = str(n)
            length = len(nStr)
            count += 1
            for i in range(0, length):
                digit = int(nStr[i])
                summ += pow(digit,2)
            n = summ
            if (summ == 1): return True
            if count > 10: return False
        return 

# convert the numbers into string
