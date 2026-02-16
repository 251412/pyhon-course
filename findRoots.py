a = int(input("give a:"))
b = int(input("give b:"))
c = int(input("give c:"))
root1 = 0
root2 = 0
d=(b**2)-4*a*c
root1= (-b + (d**(0.5)))/2*a
root2= (-b - (d**(0.5)))/2*a  
print(f"Roots:",({root1}),({root2}))
