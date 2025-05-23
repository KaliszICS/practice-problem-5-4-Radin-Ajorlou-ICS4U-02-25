class MusicPlayer implements Player{

    private boolean onOff;
    private String[] musicList;
    private String currentSong;
    private int volume;

    public MusicPlayer(String[] musicList){
        this.musicList = musicList;
        this.volume = 0;
        this.onOff = false;
        this.currentSong = "";
    }

    @Override
    public void start(){
        if (this.onOff == false){
            this.onOff = true;
            this.currentSong = this.musicList[0];
        }
    }

    @Override
    public void stop(){
        if (this.onOff == true){
            this.onOff = false;
            this.currentSong = "";
        }
    }

    public boolean getOnOff(){
        return this.onOff;
    }

    @Override
    public void volumeUp(){
        this.volume += 1;
    }

    @Override
    public void volumeDown(){
        this.volume -= 1;
    }

    @Override 
    public int getVolume(){
        return this.volume;
    }

    public void next(){
        int length = this.musicList.length;
        for (int i = 0; i < length ; i ++){
            if (this.musicList[i].equals(this.currentSong)){
                this.currentSong = musicList[i + 1];
                i = length;
            }
        }
    }

    public void previous(){
            int length = this.musicList.length;
        for (int i = 0; i < length ; i ++){
            if (this.musicList[i].equals(this.currentSong)){
                this.currentSong = musicList[i - 1];
                i = length;
            }
        }
    }

    public String getCurrentSong(){
        return this.currentSong;
    }
}