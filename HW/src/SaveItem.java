abstract class PairMap {
    protected String keyArray[];
    protected String valueArray[];
    abstract String get(String key);
    abstract void put(String key, String value);
    abstract String delete(String key);
    abstract int length();
}

class Dictionary extends PairMap{
    private int cnt;
    public Dictionary(int size) { keyArray = new String[size]; valueArray = new String[size]; cnt = 0;}
    String get(String key){
        for(int i = 0; i < cnt; i++){
            if(keyArray[i].equals(key)){
                return valueArray[i];
            }
        }
        return "null";
    }
    void put(String key, String value){
        int index = cnt;
        for(int i = 0; i < cnt; i++){
            if(key.equals(keyArray[i])){
                index = i;
                break;
            }
        }
        keyArray[index] = key;
        valueArray[index] = value;
        cnt++;
    }
    String delete(String key){
        String temp = get(key);
        int index = cnt;
        for(int i = 0; i < cnt; i++){
            if(key.equals(keyArray[i])){
                index = i;
                break;
            }
        }
        keyArray[index] = "";
        valueArray[index] = "";
        cnt--;
        return temp;
    }
    int length(){
        return cnt;
    }
}

class SaveItem {
    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("Hwang Gi-tae", "Java");
        dic.put("Lee Jae-moon", "Python");
        dic.put("Lee Jae-moon", "C++");
        System.out.println("Lee Jae-moon's price is "+dic.get("Lee Jae-moon"));
        System.out.println("Hwang Gi-tae's price is "+dic.get("Hwang Gi-tae"));
        dic.delete("Hwang Gi-tae");
        System.out.println("Hwang Gi-tae's price is "+dic.get("Hwang Gi-tae"));
    }
}