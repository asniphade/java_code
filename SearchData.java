package ArrayProgram;

import java.util.ArrayList;

public class SearchData {
   static ArrayList<UserEntity> arrayList;

   public static void main(String[] args) {
      arrayList = new ArrayList();
      createRecords();
   }

   private static void createRecords() {
      for(int i = 1; i <= 5; ++i) {
         String UserName = "User" + i;
         String Address = "Nashik";
         UserEntity entity = new UserEntity();
         entity.UserName = UserName;
         entity.MobNo = i;
         entity.Address = Address;
         entity.Age = i;
         arrayList.add(entity);
      }

      System.out.println(((UserEntity)arrayList.get(2)).UserName);
   }
}
