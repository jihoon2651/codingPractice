package com.edu.twond;

public class Five {

    public int[] solution(String[] history){

        Stock stock = new Stock();
        int[] answer = new int[history.length];

        stock.setPorkFeet(5);
        stock.setOnion(100);
        stock.setGreenOnion(10);
        stock.setGarlic(5);
        stock.setPepper(2);

        double eat = 0;
        int price = 0;
        int orderAmount = 0;

        for (int i = 0; i < history.length; i++) {
            eat = Double.parseDouble(history[i]);
            if((history[i].split("\\.")[1].equals("5")
                    ||history[i].split("\\.")[1].equals("0")) &&
                    eat >= 0){

                if(stock.getPorkFeet() >= 4 * eat){
                    stock.setPorkFeet((int)(stock.getPorkFeet()-4*eat));
                }else{
                    if((int)((4 * eat - stock.getPorkFeet())) % 10 == 0){
                        orderAmount = (int)((4 * eat - stock.getPorkFeet())/10);
                        price += 10000*orderAmount;
                        stock.setPorkFeet((int) ((stock.getPorkFeet()+10*orderAmount)
                                - 4 * eat));
                    }else{
                        orderAmount = (int)((4 * eat - stock.getPorkFeet())/10)+1;
                        price += 10000*orderAmount;
                        stock.setPorkFeet((int) ((stock.getPorkFeet()+10*orderAmount)
                                - 4 * eat));
                    }

                }

                if(stock.getOnion() >= 50 * eat){
                    stock.setOnion((int)(stock.getOnion()-50*eat));
                }else{
                    if((int)((50 * eat - stock.getOnion())) % 100 == 0){
                        orderAmount = (int)((50 * eat - stock.getOnion())/100);
                        price += 3000*orderAmount;
                        stock.setOnion((int) ((stock.getOnion()+100*orderAmount)
                                - 50 * eat));
                    }else{
                        orderAmount = (int)((50 * eat - stock.getOnion())/100)+1;
                        price += 3000*orderAmount;
                        stock.setOnion((int) ((stock.getOnion()+100*orderAmount)
                                - 50 * eat));
                    }

                }

                if(stock.getGreenOnion() >= 10 * eat){
                    stock.setGreenOnion((int)(stock.getGreenOnion()-10*eat));
                }else{
                    if((int)((10 * eat - stock.getGreenOnion())) % 30 == 0){
                        orderAmount = (int)((10 * eat - stock.getGreenOnion())/30);
                        price += 1000*orderAmount;
                        stock.setGreenOnion((int) ((stock.getGreenOnion()+30*orderAmount)
                                - 10 * eat));
                    }else{
                        orderAmount = (int)((10 * eat - stock.getGreenOnion())/30)+1;
                        price += 1000*orderAmount;
                        stock.setGreenOnion((int) ((stock.getGreenOnion()+30*orderAmount)
                                - 10 * eat));
                    }
                }

                if(stock.getGarlic() >= 10 * eat){
                    stock.setGarlic((int)(stock.getGarlic()-10*eat));
                }else{
                    if( (int)((10 * eat - stock.getGarlic())) % 50 == 0){
                        orderAmount = (int)((10 * eat - stock.getGarlic())/50);
                        price += 2000*orderAmount;
                        stock.setGarlic((int) ((stock.getGarlic()+50*orderAmount)
                                - 10 * eat));
                    }else{
                        orderAmount = (int)((10 * eat - stock.getGarlic())/50)+1;
                        price += 2000*orderAmount;
                        stock.setGarlic((int) ((stock.getGarlic()+50*orderAmount)
                                - 10 * eat));
                    }

                }

                if(history[i].contains(".5")){
                    if(stock.getPepper() >= 2 * eat){
                        stock.setPepper((int)(stock.getPepper() - 2*eat));
                    }else{
                        if((int)((4 * eat - stock.getPepper())) % 10 == 0){
                            orderAmount = (int)((4 * eat - stock.getPepper())/10);
                            price += 1000*orderAmount;
                            stock.setPepper((int) ((stock.getPepper()+10*orderAmount)
                                    - 2 * eat));
                        }else{
                            orderAmount = (int)((4 * eat - stock.getPepper())/10)+1;
                            price += 1000*orderAmount;
                            stock.setPepper((int) ((stock.getPepper()+10*orderAmount)
                                    - 2 * eat));
                        }

                    }
                }else{
                    if(stock.getPepper() >= 4 * eat){
                        stock.setPepper((int)(stock.getPepper() - 4*eat));
                    }else{
                        if((int)((4 * eat - stock.getPepper())) % 10 == 0){
                            orderAmount = (int)((4 * eat - stock.getPepper())/10);
                            price += 1000*orderAmount;
                            stock.setPepper((int) ((stock.getPepper()+10*orderAmount)
                                    - 4 * eat));
                        }else{
                            orderAmount = (int)((4 * eat - stock.getPepper())/10)+1;
                            price += 1000*orderAmount;
                            stock.setPepper((int) ((stock.getPepper()+10*orderAmount)
                                    - 4 * eat));
                        }
                    }
                }
            }else{
                answer = new int[]{-1};
                break;
            }

            answer[i] = price;
            price = 0;
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }

        return answer;
    }
}
