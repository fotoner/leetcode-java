package A1000A2000.S1861RotatingTheBox;

class Solution {
    class Box{
        private int width;
        private int height;
        private char[][] box;

        public Box(char[][]rawBox) {
            this.width = rawBox.length;
            this.height = rawBox[0].length;
            this.box = new char[height][width];

            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    box[j][width - i - 1] = rawBox[i][j];
                }
            }
        }

        void run() {
            for (int i = 0; i < width; i++) {
                int lastStack = height - 1;
                for (int j = lastStack; j > -1; j--) {
                    if (box[j][i] == '#') {
                        box[j][i] = '.';
                        box[lastStack][i] = '#';
                        lastStack = lastStack - 1;
                    } else if (box[j][i] == '*') {
                        lastStack = j - 1;
                    }
                }
            }
        }

        public char[][] getBox() {
            return box;
        }
    }

    public char[][] rotateTheBox(char[][] box) {
        Box newBox = new Box(box);
        newBox.run();

        return newBox.getBox();
    }
}