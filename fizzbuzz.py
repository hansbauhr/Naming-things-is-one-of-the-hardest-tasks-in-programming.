for k in range(1,100): print("Fizz"*(k % 3 == 0) + "Buzz"*(k % 5 == 0) + str(k) * (not k % 3 == 0 and not k % 5 == 0) + ", "*(k != 99), end="")
