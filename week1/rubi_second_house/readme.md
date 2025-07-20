This file explains an efficient approach to the problem of minimizing the total cost to paint a row of houses with different colors, where no two adjacent houses can have the same color.

My initial brute-force method worked for small inputs but became too slow as the data grew. So I switched to a dynamic programming solution.

The key idea is to build the answer step-by-step. To figure out the cheapest way to paint the current house, I only look at the results from the previous house.

Here’s the trick that makes it fast: for every house, I track the two smallest costs from the previous house. If the color I’m using now is different from the color used in the previous house’s cheapest path, I just add that cheapest cost. If it's the same color, I use the second cheapest instead.

This avoids checking all colors again and again, which makes the solution efficient.

Time complexity is O(n * k), where n is the number of houses and k is the number of colors. The space usage is minimal — just a few variables are needed, not a full DP table.
