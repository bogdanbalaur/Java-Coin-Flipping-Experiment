This experiment receives an integer input N and a sequence of H or T (such as HTHTHT) of any length.
N represents the number of trials, so increasing N will result in increased accuracy at the expense of computation time.

The experiment tests the expected number of coin-flips until the H/T pattern entered appears for the first time.
One's natural instinct is that patterns of the same length (for example HHHH or HTHT) should return near-identical expected first-appearance times.
However, due to overlaps in the patterns, this is not the case - a pattern such as HHHH will normally take longer to appear for the first time than a pattern such as HTHT.

Why is this?

Let's take the pattern HTHT as an example.

Imagine a casino that flips a single coin once per day.
Every day, a new gambler enters the casino and bets on the pattern HTHT appearing over the next four days.
They each bet £1 upon entry to the casino and will double their bet the next day should they win, or lose everything if their pattern fails to appear.

The probability that HTHT will appear for them is 1/16 and their winnings will be £16.  Hence their expected winnings are £1. 
Since they initially bet £1, their expected winnings (and therefore the casino's as well) are £0.  
So this game is a fair game.

Now imagine the pattern HTHT has appeared for the first time at time T.
This means that, until time T-3, nobody managed to win the game.
However, the lucky gambler who entered at T-3 has won £16.
The less lucky gambler at time T-2 has lost their £1 (since the coin-flip when they entered was T).
But the gambler at time T-1 has so far only seen the pattern HT.  They are not currently a loser and hold £4!

This overlap in the pattern HTHT (and by extension overlaps in all H/T patterns) is what affects this experiment.

Patterns that have more overlaps, such as HHHH, must take more flips on average to appear for the first time. 
This is because the experiment is a fair game - noone should be expecting to make a risk-free profit from it.  
If it weren't this way, either the casino or the gamblers could manipulate certain outcomes to game the system and therefore it would not be a fair game, by definition.

Although this concept is weird to grasp, this Java class clearly shows the differences between different patterns.

Try it with N = 100, and patterns such as HHHH, HTHT, HTTT, HHTT etc.
