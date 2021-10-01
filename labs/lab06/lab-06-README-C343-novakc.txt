1. The root of the huffman tree starts with the letter with the lowest frequency, and the two lowest frequency letters
are attached to a new "root" with the combined value of the two frequencies being the root, and the letters are children.
This root merges with the next largest frequency and the sum of the two values are the new root, while the additional letter
and previous combined value are the children. This process continues until the last letter.