package com.ads.adsmanagermodule

object AdsManager {
    fun  LoadAdBanner(IAdBanner: IAdBanner)
    {
        IAdBanner.LoadAdBanner()
    }
    fun  LoadInterstitalAd(interstitalAd : IInterstitalAd)
    {
        interstitalAd.LoadInterstitalAd()
    }
    fun  LoadRewordedInterstitalAd(rewordedInterstitalAd :  IRewordedInterstatialAd)
    {
        rewordedInterstitalAd.LoadRewordedInterstatialAd()
    }
    fun  ShowInterstitalAd(interstitalAd :  IInterstitalAd)
    {
        interstitalAd.ShowInterstatialAd()
    }
    fun  ShowRewordedInterstitalAd(rewordedInterstitalAd :  IRewordedInterstatialAd)
    {
        rewordedInterstitalAd.ShowRewordedInterstatialAd()
    }
}
