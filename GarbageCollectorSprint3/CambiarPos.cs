using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class CambiarPos : MonoBehaviour
{
    private Vector3 cambio;
    private float y = 1.0f;
    private float m_Speed = 2.0f;
    public Rigidbody cuboquecambia;
    void Start()
    {
        cuboquecambia = GetComponent<Rigidbody>();
    }
    void Update()
    {
        GC();   
    }
    void GC(){   
        if(y < 5.0f){
            y = y + 1.0f;
            cambio = new Vector3(1.0f, y, 1.0f);
            y = y + 1.0f;
            cambio = new Vector3(1.0f, y, 1.0f);
            y = y + 1.0f;
            cambio = new Vector3(1.0f, y, 1.0f);
            y = y - 1.0f;
            cambio = new Vector3(1.0f, y, 1.0f);
            y = y + 1.0f;
            cambio = new Vector3(1.0f, y, 1.0f);
            y = y + 1.0f;
            cambio = new Vector3(1.0f, y, 1.0f);
            y = y - 1.0f;
            cambio = new Vector3(1.0f, y, 1.0f);
            y = y + 1.0f;
            cambio = new Vector3(1.0f, y, 1.0f);
            y = y - 1.0f;
            cambio = new Vector3(1.0f, y, 1.0f);
            cuboquecambia.position = cambio * m_Speed;  
            GC();
        }
        else{
            y = 1.0f;
            cambio = new Vector3(1.0f, y, 1.0f);
            cuboquecambia.position = cambio * m_Speed;
            System.GC.Collect();
        }        
    }
}