package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    Car car = new Car("Tesla", "Model X", 2023);
    Motorcycle motorcycle = new Motorcycle("Polytron", "Fox-R", 2022);


// 1. Проверить, что экземпляр объекта Car также является экземпляром транспортного
// средства (используя оператор instanceof).
    @Test
    void CarExtendsVehicleIsCorrected() {
        assertThat(car instanceof Vehicle);
    }

// 2. Проверить, что объект Car создается с 4-мя колесами.
    @Test
    void CarCreatedWithFourthWheels() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

// 3. Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    void MotorcycleCreatedWithTwoWheels() {
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

// 4. Проверить, что объект Car развивает скорость 60 в режиме тестового
// вождения (используя метод testDrive()).
    @Test
    void CarCheckSpeedInTestDrive() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

// 5. Проверить, что объект Motorcycle развивает скорость 75 в режиме
// тестового вождения (используя метод testDrive()).
    @Test
    void MotorcycleCheckSpeedInTestDrive() {
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

// 6. Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция
// движения транспорта) машина останавливается (speed = 0).
    @Test
    void CarCheckSpeedInPark() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

// 7. Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция
// движения транспорта) мотоцикл останавливается (speed = 0).
    @Test
    void MotorcycleCheckSpeedInPark() {
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}