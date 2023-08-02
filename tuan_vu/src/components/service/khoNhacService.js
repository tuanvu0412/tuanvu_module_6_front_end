import axios from "axios"

export async function getListMusic() {
  const res = await axios.get('http://localhost:8080/music');
  return res.data;
}

export async function getListStatus() {
  const res = await axios.get('http://localhost:8080/music/status');
  return res.data;
}

export async function findById(id) {
  const res = await axios.get(`http://localhost:8080/music/status/${id}`);
  return res.data;
}

export async function createMusic(music) {
  await axios.post('http://localhost:8080/music', music);
}
export async function editMusic(music){
  await axios.put('http://localhost:8080/music'+music.id,music);
}