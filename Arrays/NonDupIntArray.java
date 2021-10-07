class NonDupIntArray {

    private int[] array; // ref to array ary
    private int nElems; // number of data items

    public NonDupIntArray(int max) { // constructor
        this.array=new int[max];
        this.nElems=0;
    }

    public int size() {

        return this.array.length;

    }
    public int find(int value) {

        for(int i=0;i<this.nElems;i++){
            if(this.array[i]==value){
                return i;
            }
        }
        return -1;
    } // end find ()

    public void insert(int value) { // put element into arrray

        int index = find(value);

        if(this.nElems==this.array.length){

            System.out.println("Array is full insertion terminated.");
            return;
        }

        for(int i=0;i<this.nElems;i++){
            if(array[i]==index){
                System.out.println("Value already exist.Insertion terminated. ");
            }else{
                ary[this.nElems]=value;
                this.nElems++;
            }
        }
    }
    public boolean delete(int location) { //delete value of specific array location
        int min = this.array[0];
        int max = this.array[nElems];

        for(int i=0;i<this.nElems;i++){
            if(this.array[i]==ary[location]{
                for (int j=i;j<this.nElems-1;j++){
                    this.array[j]=this.array[j+1];
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
                    System.out.print(this.array[i]+" ");
                }
                System.out.println();
            }
        } // end class NonDupIntArray

