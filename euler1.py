# One liner to Project Euler's problem #1
# You can find the amount of numbers divisible by 3 (aka fizz's) with floor(x/3), To find the sum of them you would sum it and multiply by 3.
# You reduce with the_sum(floor(x/15... because in the sum of 3 is the sum of 15, and also in the sum of 5 is the sum of 15 so we must reduce with
# 15
from math import floor; the_sum = lambda x: (x*(x+1))/2; x = 1000 - 1; print(the_sum(floor(x/3))*3 + the_sum(floor(x/5))*5 - the_sum(floor(x/15))*15)
