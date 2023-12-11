class Comporator:
    @staticmethod
    def compare_numbers(a1, a2):
        if float(a1) and float(a2):
            if a1 > a2:
                return "Первый список имеет большее среднее значение"
            elif a2 > a1:
                return "Второй список имеет большее среднее значение"
            else:
                return "Средние значения равны"
        else:
            raise ValueError("Incorrect values")
