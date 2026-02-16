num1=int(input("give int number1:"))
num2=int(input("give int number2:"))
operation=input("give the operatar :")
if operation=="+":
    print(f"Addition of two numbers:{num1+num2}")
elif operation=="-":
    print(f"subtraction of two numbers:{num1-num2}")
elif operation=="*":
    print(f"multiplication of two numbers:{num1*num2}")
else:
    print(f"division of two numbers:{num1/num2}")