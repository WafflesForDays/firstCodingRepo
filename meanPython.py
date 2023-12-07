nums = []
for i in range(10):
    nums.append(int(input("Enter a number\n")))
mean = 0
for j in nums:
    mean += j
mean /= 10
print("mean = ", mean)