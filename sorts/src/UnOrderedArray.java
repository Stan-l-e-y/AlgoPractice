public class UnOrderedArray {
    private int maxItems;
    private int[] m_array;
    private int numElements;

    public UnOrderedArray(int max){
        maxItems = max;
        numElements = 0;
        m_array = new int[max];
    }

    public void addLast(int val){
        if(numElements < maxItems){
            m_array[numElements] = val;
            numElements++;
        }
    }

    public void listItems(){
        for(int x = 0; x < numElements; x++){
            System.out.print(m_array[x] + " ");
        }
        System.out.println();
    }

    public void selectionSort(){

        for(int x = 0; x < numElements; x++){
            int smallest = x;
            for(int nextX = x + 1; nextX < numElements; nextX++){
                if(m_array[nextX] < m_array[smallest]){
                    smallest = nextX;
                }            
            }
            int temp = m_array[x];
            m_array[x] = m_array[smallest];
            m_array[smallest] = temp;
        }
    }

    public void insertionSort(){
        for(int x = 1; x < numElements; x++){
            int temp = m_array[x];
            int pos = x - 1;
            while (pos >= 0 && m_array[pos] > temp){

                m_array[pos + 1] = m_array[pos];

                pos--;
            }
            m_array[pos + 1] = temp;

        } 
    }

    public String binarySearch(int val){

        int low, high, mid;
        low = 0;
        high = numElements -1;

        while (low <= high){

            mid = (low + high) / 2;

            if(m_array[mid] == val){
                return "Value found at index location " + mid;
            }
            else if(val < m_array[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }

        }


        return "Not found:(";

    }
}
