package test.week3;


public class robot {
    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }
    public class Robot {
        public Direction getDirection() {
            // текущее направление взгляда
        }

        public int getX() {
            // текущая координата X
        }

        public int getY() {
            // текущая координата Y
        }

        public void turnLeft() {
            // повернуться на 90 градусов против часовой стрелки
        }

        public void turnRight() {
            // повернуться на 90 градусов по часовой стрелке
        }

        public void stepForward() {
            // шаг в направлении взгляда
            // за один шаг робот изменяет одну свою координату на единицу
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        int x;
        int y;
        x = toX - robot.getX();
        y = toY - robot.getY();



    }


}
