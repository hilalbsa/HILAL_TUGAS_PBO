/* NIM   : 13020240267
Nama  : Muhammad Hilal
Hari/Tanggal : 5 April 2026
Waktu : 04:00*/
public class Oprator {
public static void main(String[] args) {

boolean Bool1, Bool2, TF;
int i,j, hsl;
float x,y,res;

Bool1 = true; Bool2 = false;

TF = Bool1 && Bool2;
TF = Bool1 || Bool2;
TF = ! Bool1;
TF = Bool1 ^Bool2;

i = 5; j = 2;

hsl = i+j;
hsl = i - j;
hsl = i / j;
hsl = i * j;
hsl = i /j;
hsl = i%j;

x = 5 ; y = 5 ;

res = x + y;
res = x - y;
res = x / y;
res = x * y;

TF = (i==j);
TF = (i!=j);
TF = (i < j);
TF = (i > j);
TF = (i <= j);
TF = (i >= j);

TF = (x != y);
TF = (x < y);
TF = (x > y);
TF = (x <= y);
TF = (x >= y);

}
}