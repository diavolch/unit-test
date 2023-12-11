from Average import Average
from Comporator import Comporator

if __name__ == '__main__':
    list1 = [4, 5, 6]
    list2 = [1, 2, 3]
    avg1 = Average(list1).get_average()
    avg2 = Average(list2).get_average()

    Comporator.compare_numbers(avg1, avg2)
