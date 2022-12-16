 public class Emp implements Comparable {
        private int id;
        private String name;
        private int sal;

        public Emp(int id, String name, int sal) {
            this.id = id;
            this.name = name;
            this.sal = sal;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSal() {
            return sal;
        }

        public void setSal(int sal) {
            this.sal = sal;
        }

        @Override
        public String toString() {
            return "Emp{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", sal=" + sal +
                    '}';
        }

        @Override
        public int compare(Object obj) {
            Emp emp = (Emp) obj;
            if(this.getSal() > emp.getSal()) {
                return  1;
            }
            if(this.getSal() < emp.getSal()) {
                return  -1;
            }
            return 0;
        }


}
