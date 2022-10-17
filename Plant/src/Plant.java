public class Plant {
    private String plantGenus;
    private String leavesType;
    private String commonName;

    public Plant(String plantGenus, String leavesType, String commonName) {
        this.plantGenus = plantGenus;
        this.leavesType = leavesType;
        this.commonName = commonName;

        }

        public void setPlantGenus(String plantGenus){  //set method
        this.plantGenus = plantGenus;

        }

        public String getPlantGenus() {  //get
            return plantGenus;

        }

        public void setLeavesType (String leavesType){ //set method
            this.leavesType = leavesType;
        }

        public String getLeaves () {  // get
            return leavesType;

        }

        public void setCommonName (String commonName){  //set method
            this.commonName=commonName;

        }

        public String getCommonName () { //get
            return commonName;
        }

    }



