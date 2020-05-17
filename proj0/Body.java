

public class Body
{
    public double xxPos; public double yyPos;
    public double xxVel; public double yyVel;
    public double mass; public String imgFileName;
    public double xxAcc; public double yyAcc;


    public Body(double xP, double yP, double xV, double yV, double m, String img){
    xxPos = xP;
    xxVel = xV;
    yyPos = yP;
    yyVel = yV;
    mass = m;
    imgFileName = img;
    }
    public Body(Body b){
        xxPos = b.xxPos;
        xxVel = b.xxVel;
        yyPos = b.yyPos;
        yyVel = b.yyVel;
        mass = b.mass;
        imgFileName = b.imgFileName;
    }

    public double calcDistance(Body b){
        double rSquare = Math.pow(xxPos - b.xxPos, 2) + Math.pow(yyPos - b.yyPos, 2);
        return (Math.pow(rSquare, 1/2));
    }

    public double[] Forcecculation(Body a, Body b){
        double force;
        double G = 6.67*(Math.pow(10,-11));
        double rSquare = Math.pow(a.xxPos - b.xxPos, 2) + Math.pow(a.yyPos + b.yyPos, 2);
        force = a.mass * b.mass * G / rSquare;
        double xxforce = force * Math.pow(Math.pow(a.xxPos - b.xxPos, 2), 1/2) / Math.pow(rSquare, 1/2);
        double yyforce = force * Math.pow(Math.pow(a.yyPos - b.yyPos, 2), 1/2) / Math.pow(rSquare, 1/2);
        a.xxAcc = xxAcc / a.mass;
        a.yyAcc = yyAcc / a.mass;
        b.xxAcc = -xxAcc / b.mass;
        b.yyAcc = -yyAcc / b.mass;
        double[] temp = new double[]{a.xxAcc, a.yyAcc, b.xxAcc, b.yyAcc};
        return temp;
    }
}