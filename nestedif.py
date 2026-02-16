weather=input("give the weather:")
time_of_day=input("give the time_of_day:")
if weather == "sunny":
    if time_of_day == "day":
        print("play cricket")
    else:
        print("its night,go to sleep")    
elif weather=="rainy":
    print("play to boat toy")
elif weather=="snowy":
    if time_of_day=="night":
        print("you play with toys ")    
    else:
        print("play with snowman toy")
else:
    print("stay inside and read a storybook.")
        