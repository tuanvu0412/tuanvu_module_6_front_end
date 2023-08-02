// import { useEffect, useState } from "react"
// import { createMusic, finById, findIdMusic, getListStatus, getTrangThai, updateTrangThai } from "./service/khoNhacService";
// import { ErrorMessage, Field, Form, Formik } from "formik";
// import Swal from "sweetalert2";
// import * as yup from 'yup';
// import '../formAdd.css';
// import { useNavigate, useParams } from "react-router-dom";
// const UpdateMusic = () => {
//     const param = useParams();
//     const navigate = useNavigate();
//     const [status, setStatus] = useState([]);

//     useEffect(() => {
//         getListTrangThai();
//         getMusicId();
//     }, [])
//     const getListTrangThai = async () => {
//         const res = await getListStatus();
//         setStatus(res);
//         console.log("123144" + res)
//     }
//     const [musics, setMusicS] = useState([]);
//     const getMusicId = async () => {
//         const data = await findIdMusic(param.id);
//         setMusicS(data);
//     }
//     const handleEditMusic = async (values) => {
//         const status = await finById(values.status);
//         const data = {...values, status: status };

//         await updateTrangThai(data).then(() => {
//             Swal.fire({
//                 icon: 'success',
//                 title: 'Success!',
//                 text: 'Music update successfully.',
//             })
//         })
//     }
//     return (
//         <>
//             {khoNhac.id && (
//                 <Formik
//                     onSubmit={async (values) => {
//                         await handleEditMusic(values);
//                         navigate('/')
//                     }}
//                     initialValues={{
//                         id:musics.id,
//                         nameOf: musics.,
//                         tenCaSi: musics.tenBaiHat, 
//                         tenNhacSi:musics.tenNhacSi,
//                         thoiGianPhat: musics.thoiGianPhat, 
//                         soLuotYeuThich: musics.soLuotYeuThich, 
//                         trangThai: musics.trangThai.id,
//                     }}
//                     validationSchema={
//                         yup.object({
//                             trangThai: yup.string().required(),
//                         })
//                     }
//                 >
//                     <Form>
//                         <div>
//                             <label htmlFor='trangThai'> Trạng thái:</label>
//                             <Field as='select' id='trangThai' name='trangThai'>
//                                 <option value={""}></option>
//                                 {status.length > 0 && status.map(t => (
//                                     <option key={t.id} value={t.id}>{t.nameOfStatus}</option>
//                                 ))}
//                             </Field>
//                             <ErrorMessage name="trangThai" className='text-red' />
//                         </div>
//                         <div className="mt-4 pt-2">
//                             <button type="submit">update</button>
//                         </div>
//                     </Form>
//                 </Formik >
//             )}
//         </>

//     )
// }
// export default UpdateMusic;