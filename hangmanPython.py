s = "_ "
e = "_ "
c = "_ "
r = "_ "
t = "_"
strikes = 0
solve = 0


while strikes < 9 and solve < 5:
    check = input("Enter a letter\n")
    if check == "s":
        s = "s "
        solve += 1
    elif check == "e":
        e = "e "
        solve += 1
    elif check == "c":
        c = "c "
        solve += 1
    elif check == "r":
        r = "r "
        solve += 1
    elif check == "t":
        t = "t"
        solve += 1
    else:
        strikes += 1
    print(f"Strikes: {strikes}/8\n")
    print("\n")
    print(s, e, c, r, e, t, "\n")
if strikes == 8:
    print("You lost the game")
elif solve == 5:
    print("Well done, you won!!")