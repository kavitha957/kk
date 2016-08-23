
     A solution could be found by trying all combinations and return the best.
    Another way to solve this is to note that in the best arrangement, for any two adjacent original integers X and Y, the concatenation X followed by Y will be numerically greater than or equal to the concatenation Y followed by X.
    Yet another way to solve this is to pad the integers to the same size by repeating the digits then sort using these repeated integers as a sort key.


