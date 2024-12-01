import Events.CannibalFest;
import Person.Cruzo;
import Person.Friday;
import Places.PartOfIsland;
import enums.Afflication;
import enums.CardinalDirections;
import enums.Languages;
import enums.Reasons;

import java.util.ArrayList;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
                try {
                        Friday fri = new Friday("Пятница", " ");
                        Cruzo Cruz = new Cruzo();
                        PartOfIsland Part = new PartOfIsland();
                        CannibalFest Fest = new CannibalFest();

                        Part.SetDirect(CardinalDirections.NORTH_WESTERN.Type());
                        Part.setReason(Reasons.TRIMBERS_PLACE.Type());
                        Part.enterplace(fri);
                        fri.happen(Afflication.WITH_TRIMBERS.Type());

                        System.out.print("И ");
                        fri.setAffilition(Afflication.LIKE_FOOD.Type());
                        Fest.Participated(fri);

                        System.out.print("Когда спустя некоторое время ");
                        Part.SetDirect(CardinalDirections.ANOTHER.Type());
                        Cruz.FollowTo(fri, Part);
                        fri.recognize(Part);
                        Part.SetDirect(CardinalDirections.ALLIN.Type());
                        Part.setReason(Reasons.NOTHING.Type());
                        fri.setAffilition(Afflication.WITH_TRIMBERS.Type());
                        fri.say();
                        Part.enterplace(fri);

                        Random random = new Random();
                        int i = 0;
                        ArrayList<Integer> variant = new ArrayList<>();
                        Integer sum = 0;

                        for (i = 0; i < 3; ++i) {
                                int k = random.nextInt(100); // Ensure compatibility with Java versions
                                variant.add(k);
                                sum += k; // Explicit cast to byte
                        }
                        System.out.println(sum);

                        CountableItems Stones = new CountableItems("Камней", sum);
                        fri.EatPeople(variant, sum);
                        fri.UnKnown(Languages.ENGLISH.Type());
                        fri.CountItems(Stones.name(), Stones.count());

                } catch (NullPointerException e) {
                        System.err.println("Ошибка инициализации объекта: " + e.getMessage());
                } catch (IllegalArgumentException e) {
                        System.err.println("Был принят не тот аргумент: " + e.getMessage());
                } catch (Exception e) {
                        System.err.println("Произошла непредвиденная ошибка: " + e.getMessage());
                } finally {
                        System.out.println("История завершена");
                }
        }
}