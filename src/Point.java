public class Point {

        private int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        void draw() {
            System.out.println(x + " " + y);
        }
        void setXY(int x, int y) {
            this.x = x;
            this.y = y;
        }

}
