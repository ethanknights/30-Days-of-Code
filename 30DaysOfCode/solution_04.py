# Task
# Write a Person class with an instance variable,
# and a constructor that takes an integer, as a parameter.
# The constructor must assign  to  after confirming the argument passed as
# is not negative; if a negative argument is passed as ,
# the constructor should set  to  and print Age is not valid, setting age to 0.
# In addition, you must write the following instance methods:
#
# yearPasses() should increase the  instance variable by .
# amIOld() should perform the following conditional actions:
# If , print You are young..
# If  and , print You are a teenager..
# Otherwise, print You are old..


class Person:
    def __init__(self, initialAge):
        # Add some more code to run some checks on initialAge
        if initialAge < 0:
            print("Age is not valid, setting age to 0.")
            self.age = 0
        else:
            self.age = initialAge

    def yearPasses(self):
        # Increment the age of the person in here
        self.age = self.age + 1
        return

    def amIOld(self):
        # Do computations & print correct statement to console
        # Switch statements avaialble in pyv3.10 only! Hackerrank's py is 3.9.4
        if self.age < 13:
            print("You are young.")
        elif self.age >= 13 and self.age < 18:
            print("You are a teenager.")
        else:
            print("You are old.")
        return


# Input:
t = int(input())
for i in range(0, t):
    age = int(input())
    p = Person(age)
    p.amIOld()
    for j in range(0, 3):
        p.yearPasses()
    p.amIOld()
    print("")
