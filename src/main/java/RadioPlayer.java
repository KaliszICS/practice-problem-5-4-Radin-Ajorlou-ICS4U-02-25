class RadioPlayer implements Player {

    private boolean onOff;
    private double[] stationList;
    private int volume;
    private double station;

    public RadioPlayer(double[] stationList){
        this.stationList = stationList;
        this.volume = 0;
        this.onOff = false;
        this.station = 0;
    }

    @Override 
    public void start(){
        if(this.onOff == false){
            this.onOff = true;
            this.station = this.stationList[0];
        }
    }

    @Override
    public void stop(){
        if (this.onOff == true){
            this.onOff = false;
            this.station = 0;
        }
    }

    public boolean getOnOff(){
        return this.onOff;
    }

    @Override
    public void volumeUp(){
        this.volume += 2;
    }

    @Override 
    public void volumeDown(){
        this.volume -= 2;
    }

    @Override
    public int getVolume(){
        return this.volume;
    }

    public void next(){
        int length = this.stationList.length;
        for (int i = 0; i < length; i++){
            if (this.station == this.stationList[i]){
                this.station = this.stationList[i + 1];
                i = length;
            }
        }
    }

    public void previous(){
                int length = this.stationList.length;
        for (int i = 0; i < length; i++){
            if (this.station == this.stationList[i]){
                this.station = this.stationList[i - 1];
                i = length;
            }
        }
    }

    public double getStation(){
        return this.station;
    }





    
}
