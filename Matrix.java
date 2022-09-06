package com.example.task.com.example.task;

import java.util.Scanner;

class Invalidrowcolumn  extends Exception
{

    public Invalidrowcolumn (String message)
    {
        super(message);
    }
}

public class Matrix {
    public  int row;
    public  int col;
    public  int[][] elm;
    Scanner sn = new Scanner(System.in);
    public void getRow(){
        System.out.println("Enter Rows");
        row=sn.nextInt();
    }
    public void setArray(){
        elm=new int[row][col];
    }
    public void getCol(){
        System.out.println("Enter Columns");
        col=sn.nextInt();
    }
    public void setEle(){
        this.setArray();
        for (int i=0;i<this.row;i++)
        {
            for (int j=0;j<this.col;j++)
            {
                System.out.println("Enter value["+i+"]["+j+"]");
                elm[i][j]= sn.nextInt();
            }
        }

    }
    public Matrix Add(Matrix x){
        System.out.println();
        System.out.println();
        if(this.row==x.row && this.col==x.col){
            System.out.println("addtion Possible");
            Matrix y=new Matrix();
            y.row=this.row;
            y.col=this.col;
            y.setArray();
            for (int i=0;i<this.row;i++)
            {
                for (int j=0;j<this.col;j++)
                {
                    y.elm[i][j]=this.elm[i][j]+x.elm[i][j];
                }
            }

            return y;
        }else {
            System.out.println("addtion is not Possible");
        }
        return null;
    }
    public Matrix mul(Matrix x){
        System.out.println();
        System.out.println();
        if(this.col==x.row){
            System.out.println("Multiplication is Possible");
            Matrix y=new Matrix();
            y.row=this.row;
            y.col=x.col;
            y.setArray();
            for (int i=0;i<y.row;i++)
            {
                for (int j=0;j<y.col;j++)
                {
                    for (int k = 0; k < this.col; k++) {
                        y.elm[i][j] += this.elm[i][k] * x.elm[k][j];
                    }
                }
            }
            return y;
        }else {
            System.out.println("addtion is not Possible");
        }
        return null;

    }
    public void addMan() throws Invalidrowcolumn{
        this.setArray();
            System.out.println("We have a Matrix of row "+row+" and Column "+col);
            System.out.print("Enter row ");
            int a=sn.nextInt();
            System.out.println("");
            System.out.print("Enter Column ");
            int b= sn.nextInt();
            System.out.println("");
            if(a>this.row || b>this.col){
                throw new Invalidrowcolumn("Enter wrong row or column");
            }else {
                System.out.print("Enter Value ");
                elm[a][b]= sn.nextInt();
                System.out.println(" ");
                System.out.println("Value Entered ");
            }
    }
    public void show(){
        for (int i=0;i<this.row;i++)
        {
            for (int j=0;j<this.col;j++)
            {
                System.out.print(this.elm[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Matrix em = new Matrix();
        Matrix em2 = new Matrix();
        Matrix em3 = new Matrix();
        Matrix em4 = new Matrix();
        em.getRow();
        em.getCol();
        em.setEle();
        em.show();
        em2.getRow();
        em2.getCol();
        em2.setEle();
        em2.show();
        em3=em.Add(em2);
        em4=em3.mul(em2);
        em3.show();
        em4.show();

    }

}
