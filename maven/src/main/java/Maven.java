import org.apache.commons.lang3.ArrayUtils;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class Maven {

    public static void arrayUtils(){
        String[] names = new String[2];
//        System.out.println(names.length);
//
//       for (String name : names){
//           if(name ==  null){
//               System.out.println("it is empty");
//           }
//       }

        boolean is =  ArrayUtils.contains(names,null);
        System.out.println(is);

    }

    public static void main(String[] args) {
            Maven.arrayUtils();
        System.out.println(LocalTime.now());
        System.out.println(LocalTime.now(ZoneId.of("Asia/Phnom_Penh")));
//        for ( String zone : ZoneId.getAvailableZoneIds())
//        {
//            System.out.println(zone);
//        }

    }
}
