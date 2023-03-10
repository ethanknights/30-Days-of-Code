class Difference:
    def __init__(self, a):
        self.__elements = a
        self.__elements_size = len(self.__elements)
        self.maximumDifference = None

    def computeDifference(self):
        maximumDifference = float()
        for i_idx, __ in enumerate(self.__elements):
            for j_idx, ___ in enumerate(self.__elements):
                current_difference = self.__elements[i_idx] - self.__elements[j_idx]

                if i_idx == 0 and j_idx == 0:
                    maximumDifference = current_difference
                elif current_difference > maximumDifference:
                    maximumDifference = current_difference
        self.maximumDifference = maximumDifference


# End of Difference class

_ = input()
a = [int(e) for e in input().split(" ")]

d = Difference(a)
d.computeDifference()

print(d.maximumDifference)
