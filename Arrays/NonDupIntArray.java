class NonDupIntArray {

    private int[] ary; // ref to array ary
    private int nElems; // number of data items

    public NonDupIntArray(int max) { // constructor
        this.ary=new int[max];
        this.nElems=0;
    }

    public int size() {

        return this.ary.length;

    }
    public int find(int value) {

        for(int i=0;i<this.nElems;i++){
            if(this.ary[i]==value){
                return i;
            }
        }
        return -1;
    } // end find ()

    public void insert(int value) { // put element into arrray

        int index = find(value);

        if(this.nElems==this.ary.length){

            System.out.println("Array is full insertion terminated.");
            return;
        }

        for(int i=0;i<this.nElems;i++){
            if(ary[i]==index){
                System.out.println("Value already exist.Insertion terminated. ");
            }else{
                ary[this.nElems]=value;
                this.nElems++;
            }
        }
    }
    public boolean delete(int location) { //delete value of specific array location
        int min = this.ary[0];
        int max = this.ary[nElems];

        for(int i=0;i<this.nElems;i++){
            if(this.ary[i]==ary[location]{
                for (int j=i;j<this.nElems-1;j++){
                    this.ary[j]=this.ary[j+1];
                }
                this.nElems--;
                System.out.println("value deleted.");
                return true;
            } // end delete ()
        }
    }
    public void display() {//display array contents
                System.out.println("-----values in the array------");
                for(int i=0;i<this.nElems;i++){
                    System.out.print(this.ary[i]+" ");
                }
                System.out.println();
            }
        } // end class NonDupIntArray

