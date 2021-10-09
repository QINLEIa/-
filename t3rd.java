public class t3rd {public class mystack {
    public static void main(String[] args) {
        my ele = new my();
        try {
            ele.ya(new Object());
            ele.ya(new Object());
            ele.ya(new Object());
            ele.ya(new Object());
            ele.ya(new Object());
            ele.ya(new Object());
            ele.ya(new Object());
            ele.ya(new Object());
            ele.ya(new Object());
            ele.ya(new Object());
            ele.ya(new Object());
        } catch (mystackexception mystackexception) {
            mystackexception.printStackTrace();
        }


    }
}
    class my{
        private Object[] ele = new Object[10];
        private int index = -1;

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public Object[] getEle() {
            return ele;
        }

        public void setEle(Object[] ele) {
            this.ele = ele;
        }

        public my() {
        }

        public my(Object[] ele, int index) {
            this.ele = ele;
            this.index = index;
        }

        public void ya(Object a) throws mystackexception {
            if(index >= 9){
                throw new mystackexception("压栈失败");
            }
            index++;
            ele[index] = a;
            System.out.println(ele + "压栈成功");
        }
        public void chu(Object a){

        }


    }
}
