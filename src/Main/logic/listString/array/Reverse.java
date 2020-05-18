package Main.logic.listString.array;

public class Reverse {

    public static int[][] arrayReverse(int[][]array){

int[][] returnArray = new int[array[0].length][array.length];
int tmpI = 0;
int tmpJ = array.length-1;

for(int[] srI:array){
    for(int srJ:srI)
        returnArray[tmpI++][tmpJ]=srJ;
    tmpI =0;
    tmpJ--;
}
return returnArray;

    }
}
