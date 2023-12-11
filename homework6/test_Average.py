import pytest

from Average import Average
from Comporator import Comporator


def test_init_list():
    """Test get correct initiate list"""
    list1 = [1, 2, 3]
    assert Average(list1).list1 == list1


def test_symbol_in_list():
    """Test find symbols in list"""
    list1 = [1, 3, "s", 7]
    with pytest.raises(ValueError):
        Average(list1).get_average()


def test_get_average():
    """Test get correct average"""
    list1 = [1, 2, 3]
    avg = Average(list1)
    assert avg.get_average() == 2


def test_correct_symbol_compare():
    """Test find symbols in variables"""
    a1 = 5
    a2 = "s"
    with pytest.raises(ValueError):
        Comporator.compare_numbers(a1, a2)


def test_first_avg_more():
    """Test when first average more than second"""
    list1 = [4, 5, 6]
    list2 = [1, 2, 3]
    avg1 = Average(list1).get_average()
    avg2 = Average(list2).get_average()

    result = Comporator.compare_numbers(avg1, avg2)
    assert result == "Первый список имеет большее среднее значение"


def test_second_avg_more():
    """Test when second average more than first"""
    list1 = [4, 5, 6]
    list2 = [7, 8, 9]
    avg1 = Average(list1).get_average()
    avg2 = Average(list2).get_average()

    result = Comporator.compare_numbers(avg1, avg2)
    assert result == "Второй список имеет большее среднее значение"


def test_avgs_equal():
    """Test when two averages equal"""
    list1 = [5, 6, 13]
    list2 = [7, 8, 9]
    avg1 = Average(list1).get_average()
    avg2 = Average(list2).get_average()

    result = Comporator.compare_numbers(avg1, avg2)
    assert result == "Средние значения равны"
