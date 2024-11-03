package com.mimaraslan.robotlar;

public interface SanayiTeknolojiBakanligiKurallari {
/* Asimov
  1.Bir Robot, bir insana zarar veremez, ya da zarar görmesine seyirci kalamaz.
  2.Bir robot, birinci yasayla çelişmediği sürece bir insanın emirlerine uymak zorundadır.
  3.Bir robot, birinci ve ikinci yasayla çelişmediği sürece kendi varlığını korumakla yükümlüdür.
 */

    public boolean insanAnalizi(boolean durum);

    public boolean insanKorumaDurumu(boolean durum);

    public boolean chipNumrasiDurumu(boolean durum);

    public default void bakimHizmetiAlmaDurumu(){
        System.out.println("Bakim Hizmeti Durumu Alınacak.");
    }

}
