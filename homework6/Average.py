class Average:
    def __init__(self, list1):
        self.list1 = list1

    def get_average(self):
        for i in self.list1:
            if float(i):
                continue
            else:
                raise ValueError("List have other symbols")
        if self.list1:
            avg = sum(self.list1) / len(self.list1)
        return avg

