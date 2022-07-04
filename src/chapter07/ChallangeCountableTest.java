package chapter07;

public class ChallangeCountableTest {
    public static void main(String[] args) {
        ChallangeCountable[] m = {
                new ChallangeBird("뻐꾸기",5), new ChallangeBird("독수리",2),
                new ChallangeTree("사과나무",10), new ChallangeTree("밤나무",7)
        };

        for(ChallangeCountable e : m)
            e.count();

        for(int i=0;i<m.length;i++){
            if(m[i] instanceof ChallangeBird) {
                m[i] = (ChallangeBird)m[i];
                ((ChallangeBird) m[i]).fly();
            }else{
                m[i] = (ChallangeTree)m[i];
                ((ChallangeTree) m[i]).ripen();
            }

        }
    }
}
