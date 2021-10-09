public class t2rd {
    public class room {
        private int bianhao;
        private String leixin;
        private boolean zhuangtai;

        public int getBianhao() {
            return bianhao;
        }

        public void setBianhao(int bianhao) {
            this.bianhao = bianhao;
        }

        public String getLeixin() {
            return leixin;
        }

        public void setLeixin(String leixin) {
            this.leixin = leixin;
        }

        public boolean isZhuangtai() {
            return zhuangtai;
        }

        public void setZhuangtai(boolean zhuangtai) {
            this.zhuangtai = zhuangtai;
        }

        public room(int bianhao, String leixin, boolean zhuangtai) {
            this.bianhao = bianhao;
            this.leixin = leixin;
            this.zhuangtai = zhuangtai;
        }

        public room() {
        }

        @Override
        public String toString() {
            return "room{" +
                    "房间号=" + bianhao +
                    ", 房型='" + leixin + '\'' +
                    ", 是否被定=" + zhuangtai +
                    '}';
        }
}
